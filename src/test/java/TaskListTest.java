// import org.junit.jupiter.api.Test;
// import java.util.ArrayList;
// import duke.*;

// public class TaskListTest {

//     @Test
//     public static void markTest() throws DukeException {
//         ArrayList<Task> array = new ArrayList();
//         array.add(new Todo("Wash clothes"));
//         array.add(new Todo("Dry clothes"));

//         TaskList.mark("mark 1");


//         assertEquals("Nice! I've marked this task as done:\n" + "[X] Wash clothes", array.get(0).markAsDone());
//     }

//     @Test
//     public void unmarkTest() throws DukeException {
//         ArrayList<Task> array = new ArrayList();
//         array.add(new Todo("Wash clothes"));
//         array.add(new Todo("Dry clothes"));
//         array.add(new Todo("Wash dishes"));

//         TaskList.unmark("unmark 1");

//         assertEquals("Ok! I've marked this task as not done yet:\n" + "[ ] Wash clothes", array.get(0).markAsUndone());
//     }    
// }