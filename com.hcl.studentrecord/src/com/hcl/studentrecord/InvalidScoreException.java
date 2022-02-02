package com.hcl.studentrecord;

public class InvalidScoreException extends Exception{
public InvalidScoreException () {
	super ("Invalid score. It should be between 0 and 100.");
}
public InvalidScoreException (String message) {
	super (message);
}
}
