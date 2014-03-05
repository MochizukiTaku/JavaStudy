package study.gof.visitor.impl;

public class XMLTreeVisitor extends AbstractTreeVisitor {
	private int indent = 0;
	
	@Override
	protected void preProcess(MyTree myTree) {
		printIndent(indent++);
		if (myTree.getChildren().size() == 0) {
			System.out.println("<" + myTree.getName() + "/>");
		} else {
			System.out.println("<" + myTree.getName() + ">");
		}
	}

	@Override
	protected void postProcess(MyTree myTree) {
		indent--;
		if (myTree.getChildren().size() == 0) {
		} else {
			printIndent(indent);
			System.out.println("</" + myTree.getName() + ">");
		}

	}

	void printIndent(int indent) {
		for (int i = 0; i < indent; i++) {
			System.out.print("  ");
		}
	}
}
