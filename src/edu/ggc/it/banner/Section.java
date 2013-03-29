package edu.ggc.it.banner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Section {
	private Course course;
	private String term;
	private int section;
	private int crn;
	private Map<String, List<Meeting>> meetings;
	
	public Section(Course course, String term, int section, int crn,
			Map<String, List<Meeting>> meetings){
		this.course = course;
		this.term = term;
		this.section = section;
		this.crn = crn;
		this.meetings = meetings;
	}
	
	public String toString(){
		return String.format("%s - %d - %s %s - %02d", course.getName(), crn, course.getSubject(), course.getId(), section);
	}
}
