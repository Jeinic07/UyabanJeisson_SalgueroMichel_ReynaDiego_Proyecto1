package co.edu.unbosque.util;
import java.util.concurrent.ConcurrentSkipListSet;

public class MyDoubleLinkedList<E> {

	protected DNode<E> head;
	protected DNode<E> currentPosition;

	public MyDoubleLinkedList() {

	}

	public DNode<E> getHead() {
		return head;
	}

	public void setHead(DNode<E> head) {
		this.head = head;
	}

	public DNode<E> getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(DNode<E> currentPosition) {
		this.currentPosition = currentPosition;
	}

	// Indica un nodo en específico y lo corre para adelante
	public void forward(int... numPosition) { // multiatributo, se adecua a la cantidad de atributos que se necesiten.

		if (numPosition[0] > 0 && head != null) {
			int positionForward = numPosition[0];
			if (currentPosition == null) {
				currentPosition = head;
				positionForward--;
			}
			while (currentPosition.getNext() != null && positionForward > 0) {
				currentPosition = currentPosition.getNext();
				positionForward--;
			}

		}

	}

	public void insert(E data) {
		DNode<E> temp = new DNode<E>(data);
		if (currentPosition == null) {
			temp.setNext(head);

			if (head != null) {
				head.setPrevius(temp);
			}
			head = temp;
		} else {
			temp.setNext(currentPosition.getNext());
			temp.setPrevius(currentPosition);
			if (currentPosition.getNext() != null) {
				currentPosition.getNext().setPrevius(temp);
			}
			currentPosition.setNext(temp);
		}
		currentPosition = temp;

	}

	// Trae la información, quita ese nodo y muestra todos los demas
	public E extract() {
		E info = null;
		if (currentPosition != null) {
			info = currentPosition.getInfo();

			if (head == currentPosition) {
				head = currentPosition.getNext();
			} else {
				currentPosition.getPrevius().setNext(currentPosition.getNext());
			}
			if (currentPosition.getNext() != null) {
				currentPosition.getNext().setPrevius(currentPosition.getPrevius());
			}
			currentPosition = currentPosition.getNext();
		}
		return info;
	}

	public void backWards(int... numPosition) {

		if (numPosition[0] <= 0 || head == null || currentPosition == null) {
			return;
		}
		int positionBack = numPosition[0];
		while (currentPosition != null && positionBack > 0) {
			currentPosition = currentPosition.getPrevius();
			positionBack--;
		}
	}
	
	public boolean isEmpty() {
		return (head == null) ? true : false;
	}
	
	public int size() {
		int size = 0;
		DNode<E> temp = head;
		while (temp != null) {
			size++;
			temp = temp.getNext();
		}
		return size;
	}
	
	public void remove(int i) {
		int index = 0;

		if (i > size() || head == null || i < 0) {
			return;
		}
		currentPosition = head;
		if (!this.isEmpty()) {
			while (index < i) {
				index++;
				currentPosition = currentPosition.getNext();
			}

			if (currentPosition.getNext() != null) {

				if (currentPosition.getPrevius() == null) {
					currentPosition.getNext().setPrevius(null);
					head = currentPosition.getNext();

				} else {
					currentPosition.getPrevius().setNext(currentPosition.getNext());
					currentPosition.getNext().setPrevius(currentPosition.getPrevius());
				}

			} else {
				if (currentPosition.getPrevius() != null) {
					currentPosition.getPrevius().setNext(null);
				} else {
					head = null;
				}
			}
		}
	}
	
	@Override
	public String toString() {
		DNode<E> temp = head;
		StringBuilder sb = new StringBuilder();
		while(temp != null) {
			sb.append(temp.getInfo());
			 if(temp.getNext() != null) {
				 sb.append(" <-> ");
			 }
			 temp = temp.getNext();
		}
		return sb.toString();

	}
}
