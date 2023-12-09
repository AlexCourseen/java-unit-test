@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Если 18 и более, то true", true, isAdult);
	// Напиши код здесь
}
