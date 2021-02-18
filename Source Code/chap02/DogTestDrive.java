class DogTestDrive {
	public static void main (String[] args) {
		Dog dog1 = new Dog();
		dog1.size = 40;
		dog1.name = "Fluffy";
		dog1.bark();

		Dog dog2 = new Dog();
		dog2.size = 5;
		dog2.name = "Dude dog";
		dog2.bark();		
	}
}