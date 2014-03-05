package study.gof.visitor.impl;

import study.gof.visitor.core.Acceptor;
import study.gof.visitor.core.Visitor;

public abstract class AbstractTreeVisitor implements Visitor {

	@Override
	public final void visit(Acceptor acceptor) {
		if (acceptor instanceof MyTree) {
			visitMyTree((MyTree)acceptor);
		}
	}

	private void visitMyTree(MyTree myTree) {
		//System.out.println("visit" + myTree.getName());
		preProcess(myTree);
		processChildren(myTree);
		postProcess(myTree);
	}

	protected abstract void preProcess(MyTree myTree);

	private void processChildren(MyTree myTree) {
		for (MyTree child : myTree.getChildren()) {
			child.accept(this);
		}
	}

	protected abstract void postProcess(MyTree myTree);

}
