package thinking.paragraph5.PassingThis;

public class Apple {
	Apple getPeeled() {
		return Peeler.peel(this);
	}
}