package study.gof.visitor.impl;

public class IndentTreeVisitor extends AbstractTreeVisitor {
	private int indent = 0;
	
	@Override
	protected void preProcess(MyTree myTree) {
		printIndent(indent++);
		System.out.println(myTree.getName());
	}

	@Override
	protected void postProcess(MyTree myTree) {
		indent--;
	}

	void printIndent(int indent) {
		for (int i = 0; i < indent; i++) {
			System.out.print("  ");
		}
	}
}
