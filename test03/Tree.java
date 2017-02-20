package test03;

public class Tree {

	public int x;
	public Tree l;
	public Tree r;

	public Tree(int x) {
		this.x = x;
		this.l = null;
		this.r = null;
	}

	public int getHeight(Tree T) {
		if (T == null) {
			return 0;
		}
		return 1 + Math.max(getHeight(T.l), getHeight(T.r));
	}

}
