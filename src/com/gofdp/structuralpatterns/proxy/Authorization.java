package com.gofdp.structuralpatterns.proxy;

public enum Authorization {

	BASE, OPERATOR, ADMIN;
}

@SuppressWarnings("serial")
class UnauthorizedException extends RuntimeException {}
