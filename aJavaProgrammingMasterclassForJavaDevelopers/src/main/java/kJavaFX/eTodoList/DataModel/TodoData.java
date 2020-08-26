package kJavaFX.eTodoList.DataModel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

public class TodoData {
    private static final TodoData instance = new TodoData();

    private ObservableList<TodoItem> todoItems;
    private DateTimeFormatter formatter;

    public static TodoData getInstance() {
        return instance;
    }

    private TodoData() {
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    }

    public ObservableList<TodoItem> getTodoItems() {
        return todoItems;
    }

    public void addTodoItem(TodoItem todoItem) {
        todoItems.add(todoItem);
    }

    public void loadTodoItems() throws IOException {
        todoItems = FXCollections.observableArrayList();
        BufferedReader br = new BufferedReader(new FileReader(new File("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/kJavaFX/eTodoList/TodoListItem.txt")));

        String input;

        try{
            while((input = br.readLine()) != null) {
                String[] itemPieces = input.split("\t");

                String shortDescription = itemPieces[0];
                String details = itemPieces[1];
                String dateString = itemPieces[2];

                LocalDate date = LocalDate.parse(dateString, formatter);
                TodoItem todoItem = new TodoItem(shortDescription, details, date);
                todoItems.add(todoItem);
            }
        } finally {
            if(br != null) {
                br.close();
            }
        }
    }

    public void storeTodoItems() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/kJavaFX/eTodoList/TodoListItem.txt")));

        try {
            Iterator<TodoItem> iter = todoItems.iterator();
            while(iter.hasNext()) {
                TodoItem item = iter.next();
                bw.write(String.format("%s\t%s\t%s",
                        item.getShortDescription(),
                        item.getDetails(),
                        item.getDeadline().format(formatter)));
                bw.newLine();
            }

        } finally {
            if(bw != null) {
                bw.close();
            }
        }
    }

    public void deleteTodoItem(TodoItem item) {
        todoItems.remove(item);
    }
}
