package study.gof.visitor.impl;

import study.gof.visitor.core.Visitor;

public class Main {
	public static void main(String[] args) {
		MyTree root = new MyTree("root");
		MyTree l1a = root.addChild(new MyTree("l1-a"));
		MyTree l1b = root.addChild(new MyTree("l1-b"));
		MyTree l2a = l1a.addChild(new MyTree("l2-a"));
		MyTree l2b = l1a.addChild(new MyTree("l2-b"));
		
		Visitor visitor1 = new IndentTreeVisitor();
		Visitor visitor2 = new XMLTreeVisitor();
		
		root.accept(visitor1);
		root.accept(visitor2);
	}
}
