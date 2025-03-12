import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { GenericService } from '../../service/base/generic.service';
import { catchError, of } from 'rxjs';

@Component({
  selector: 'app-generic-table',
  imports: [],
  templateUrl: './generic-table.component.html',
  styleUrl: './generic-table.component.css'
})
export class GenericTableComponent<T extends { id: any }> implements OnInit {
  @Input()
  data : T[] = []

  @Input() 
  columns: { key: keyof T; label: string }[] = [];

  @Input() 
  service?: GenericService<T>;

  @Output()
  deleteEvent = new EventEmitter<number>();

  @Output()
  updateEvent = new EventEmitter<any>();

  isLoading = true;
  hasError = false;

  constructor(){}

    public deleteStudent(index : number){
      this.deleteEvent.emit(index);
    }

    public updateStudent(data : T){
      this.updateEvent.emit(data);
    }

    ngOnInit(): void {
      if (this.service) {
        this.service
          .getAll()
          .pipe(
            catchError((error) => {
              this.hasError = true;
              this.isLoading = false;
              console.error('Error fetching data:', error);
              return of([]);
            })
          )
          .subscribe((fetchedData) => {
            this.isLoading = false;
            this.data = fetchedData;
          });
      }
    }

    trackByIndex(index: number): number {
      return index;
    }
  
    trackByRowId(index: number, row: T): any {
      return row.id;
    }
}
