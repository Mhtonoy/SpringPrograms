package in.mh.beans;

import java.util.List;

public class Subjects 
{
	private List<String> subjects;
	
	public Subjects()
	{
		System.out.println("Subjects object created through no-argument constructor");
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return subjects.toString();
	}
	
}
