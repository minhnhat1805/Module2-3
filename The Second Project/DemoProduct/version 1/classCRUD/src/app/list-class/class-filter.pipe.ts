import { PipeTransform, Pipe } from '@angular/core';
import { Classroom } from '../Classroom';
 
@Pipe({
    name :'classFilter'
})
export class ClassFilterPipe implements PipeTransform{
    transform( classrooms: Classroom[],searchTerm:string): Classroom[]{
        if (!classrooms || !searchTerm){
            return classrooms;
        }
        return classrooms.filter(classroom =>  
            classroom.name.toLowerCase().indexOf(searchTerm.toLowerCase()) !== -1)
    }
}