package com.rabbitmq.examples.stock.consumer;

import com.rabbitmq.client.QueueingConsumer;

final class ConsumerTask implements Runnable {
    private final QueueingConsumer consumer;

    public ConsumerTask(QueueingConsumer consumer) {
        this.consumer = consumer;
    }

    public void run() {

    }
}
