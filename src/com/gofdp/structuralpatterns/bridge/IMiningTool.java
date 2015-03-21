package com.gofdp.structuralpatterns.bridge;

public interface IMiningTool {

	Gem mine(Rock rock) throws ToolBrokeException;
}

@SuppressWarnings("serial")
class ToolBrokeException extends Exception {}
