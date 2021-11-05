package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {
	private Exam exam;
	
	public GridExamConsole() {
		
	}
	
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}


	@Override
	public void print() {
		System.out.println(exam.avg()+","+exam.total());
	}


	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
		
	}

}
