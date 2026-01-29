package interfaces;

public class DataSet {
	private double sum;
	private Measurable max;
	private int count;

	public void add(Measurable measurable) {
		sum += measurable.getMeasure();
		if (count == 0 || measurable.getMeasure() > max.getMeasure())
			max = measurable;
		count++;
	}
	
	public double getSum() {
		return sum;
	}

	public Measurable getMax() {
		return max;
	}

	public static void main(String[] args) {
		DataSet data = new DataSet();
		data.add(new Student("Goofy", 3.9));
		data.add(new Student("Mickey Mouse", 3.0));
		data.add(new Student("Donald Duck", 2.5));
		System.out.println(data.getMax().getMeasure());
		System.out.println(data.getMax());
		DataSet data2 = new DataSet();
		BankAccount mine = new BankAccount("Me", 400);
		BankAccount yours = new BankAccount("You", 600);
		data2.add(mine);
		data2.add(yours);
		System.out.println(data2.getMax());

	}

}
