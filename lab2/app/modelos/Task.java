package modelos;

import java.util.ArrayList;
import java.util.List;

import play.data.validation.Constraints.*;
import javax.persistence.*;
import play.db.ebean.*;

@Entity
public class Task extends Model {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	@Required
	private String name;
	
	@Required
	private String description;

	@Required
	private int priority;

	private static Finder<Long, Task> find = new Finder(Long.class, Task.class);

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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