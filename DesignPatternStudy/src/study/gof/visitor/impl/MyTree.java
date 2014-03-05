package study.gof.visitor.impl;

import java.util.LinkedList;
import java.util.List;

import study.gof.visitor.core.Acceptor;
import study.gof.visitor.core.Visitor;

public class MyTree implements Acceptor {
	String name;
	List<MyTree> children;

	public MyTree(String name) {
		super();
		this.name = name;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public List<MyTree> getChildren() {
		if (this.children == null) {
			this.children = new LinkedList<MyTree>();
		}
		return children;
	}

	public void setChildren(List<MyTree> children) {
		this.children = children;
	}

	public MyTree addChild(MyTree child) {
		getChildren().add(child);
		return child;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
