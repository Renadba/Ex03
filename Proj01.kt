
fun main(){

    var obj = ToDo()
    var n1 = Task("ahmad" , "buy a car" , false , 1)
    var n2 = Task("abdulrahman" , "travel to NewYork" , false , 2)
    var n3 = Task("ali" , "sell my cat" , false , 3)

    obj.addTask(n1)
    obj.addTask(n2)
    obj.addTask(n3)

    obj.currentTask()
    obj.removeTask(n2)

    obj.changeTask(n3)

    println("All Tasks:")
    obj.specific(1)
    obj.specific(3)

}




data class Task(var name:String , var note:String , var isComplete : Boolean , var id : Int )

class ToDo() {

    var task = arrayListOf<Task>()

    fun currentTask() {
        println("Task Details: ")
        for (member in task) {
            println("Name: ${member.name} , Note ${member.note} , isComplete: ${member.isComplete} , ID: ${member.id}")
        }
    }

    fun specific(id: Int) {
        for (ser in task) {
            if (id == ser.id)
                println("Task: ${ser.note}")
        }
    }

    fun addTask(tasks: Task) {
        println("Add Task: "+ tasks.note)
        task.add(tasks)
    }

    fun removeTask(tasks: Task) {
        println("Remove Task: "+ tasks.note)
        task.remove(tasks)
    }

    fun changeTask(chtask: Task) {
        println("Task: ${chtask.note} , Complete: ${!chtask.isComplete}")

    }
}