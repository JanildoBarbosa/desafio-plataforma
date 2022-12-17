package entities;

public class Task extends Lesson{
	
	private String description; 
	private Integer question;
	
	public Task() {
		super();
	}

	public Task(String title, String description, Integer question) {
		super(title);
		this.description = description;
		this.question = question;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuestion() {
		return question;
	}

	public void setQuestion(Integer question) {
		this.question = question;
	}

	@Override
	public int duration() {
		return question * 5 * 60;
	}

}
