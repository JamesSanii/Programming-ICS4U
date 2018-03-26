//
//  main.swift
//  This program tests the stack class
//
//  Created by James Sanii on 26/03/18.
//  Copyright © 2018 MTHS. All rights reserved.
//


class MyStack {
	//this is a class that defines a stack
	private var list: [Int] = []

	public func push(integer: Int) {
		//add int to list
		list.append(integer);
	}
	
	public func pop() -> Int{
		//remove and return item from list
		return list.remove(at: list.count - 1)
	}
}

print("enter an integer")
let input: String? = readLine(strippingNewline: true)
if Int(input!) != nil {
	let stackObject = MyStack()
	stackObject.push(integer: Int(input!)!)
	print("\(stackObject.pop())")
}