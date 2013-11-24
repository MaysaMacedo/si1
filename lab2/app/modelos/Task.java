package modelos;

import java.util.ArrayList;
import java.util.List;

import play.data.validation.Constraints.*;
import javax.persistence.*;
import play.db.ebean.*;

@Entity
public class Task extends Model {
	@Id
	public Long id;
	@Required
	public String label;


	public static Finder<Long, Task> find = new Finder(Long.class, Task.class);

	public static List<Task> all() {
		return find.all();
	}

	public static void create(Task task) {
		task.save();
	}

	public static void delete(Long id) {
		find.ref(id).delete();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public static Finder<Long, Task> getFind() {
		return find;
	}

	public static void setFind(Finder<Long, Task> find) {
		Task.find = find;
	}

}