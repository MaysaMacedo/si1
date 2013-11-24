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
	
	@Required
	public String description;

	@Required
	public int priority;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}



}