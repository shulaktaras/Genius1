package Object2;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Human {
     private int age;
     private String name;



//     public Human(){
//     }
//
//     public Human(int age, String name){
//         this.age = age;
//         this.name = name;
//     }
//
//     public String toString(){
//         return this.age + " " + this.name;
//     }
//
//    public void setAge(int age){
//         if(age < 18){
//             System.out.println("you so younger");
//         }else {
//             this.age = age;
//         }
//    }
//
//    public int getAge(){
//         return this.age;
//    }
}
