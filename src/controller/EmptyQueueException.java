package controller;

public class EmptyQueueException extends Exception{
	public String toString() {
		return "Fila da tabela vazia!";
	}
}
