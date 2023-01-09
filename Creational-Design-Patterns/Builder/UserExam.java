
public class UserExam {

	private int englishMarks;
	private int mathsMarks;
	private int scienceMarks;
	private String name;


	private UserExam() {

	}

	public class UserExamBuilder {

		private int englishMarks;
		private int mathsMarks;
		private int scienceMarks;
		private String name;


		public UserExamBuilder setEnglishMarks(int marks) {

			this.englishMarks = marks;
			return this;
		}


		public UserExamBuilder setMathsMarks(int marks) {

			this.mathsMarks = marks;
			return this;
		}


		public UserExamBuilder setScienceMarks(int marks) {

			this.scienceMarks = marks;
			return this;
		}
		

		public UserExamBuilder setName(String name) {

			this.name = name;
			return this;
		}


		public UserExam build() throws Exception {


			if(this.name.equals("")) {
				throw new Exception("Name can not be empty");
			}

			if(this.mathsMarks < 0) {
				throw new Exception("Maths marks can not be negative");
			}

			if(this.scienceMarks < 0) {
				throw new Exception("Science marks can not be negative");
			}

			if(this.englishMarks < 0) {
				throw new Exception("English marks can not be negative");
			}


			UserExam userExam = new UserExam();
			userExam.scienceMarks = this.scienceMarks;
			userExam.englishMarks = this.englishMarks;
			userExam.mathsMarks   = this.mathsMarks;
			userExam.name         = this.name;

			return userExam;
		}
	}

	public static UserExamBuilder getBuilder() {

		UserExam.UserExamBuilder userExamBulider = (new UserExam()).new UserExamBuilder();
		return userExamBulider;
	}	
	
	
	@Override
	public String toString() {
	
		return "Name = "+this.name + "\nMaths Marks = " + this.mathsMarks + "\nScience Marks = " + this.scienceMarks + "\nEnglish Marks = " + this.englishMarks;
	}

}
