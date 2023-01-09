public class Driver {

	public static void main(String[] args) {

		try {

			UserExam userExam = UserExam.getBuilder().setEnglishMarks(10).setMathsMarks(20).setScienceMarks(30).setName("ABC").build();
			System.out.println(userExam.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
