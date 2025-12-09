package com.example.integradora.datastructures.singly_linked_list;

import com.example.integradora.model.Pedido;

public class ListNode {
    Pedido data;
    ListNode next;

    public ListNode(Pedido data) {
        this.data = data;
        this.next = null;
    }

    public Pedido getData() {
        return data;
    }

    public ListNode getNext() {
        return next;
    }
}
