import { Aftermath } from "./aftermath"

export interface EducationGoal {
    id : number
    description : string
    aftermath? : Aftermath
    active : boolean
}
