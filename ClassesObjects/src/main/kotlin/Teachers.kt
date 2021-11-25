class Teachers(
  private val specialization: String
): User("Rita", "Computer Science", 3462){

  init{
    println("Teachers details")
    println("Name: $name")
    println("Department: $department")
    println("ID Number: $id_no")
    println("Specialization: $specialization")

  }

}
  
