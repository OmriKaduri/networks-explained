# Networking abstraction explained by oo paradigm

Have you ever thought about all those conceptual models of computer networks but couldn't really grasp the idea?
Wondered what is it really means that `HTTP` is built over `TCP`? 
Amazed by the fact that you can just use networking libraries at your program, and you can talk over the internet through all kinds of media - from twisted pairs, through telephone lines and even sattelite communication - without worry about any of this?

Well, it is time to get a simplified view of how all this sorcery becomes reality.

## Let's code our own network stack!
```javascript
application = new WebApplication(
  new HTTP(
    new TCP(
      new IP(
        new TwistedPair(CATEGORY.FIVE)
      )
    )
  )
);
application.GET('/a').......... 
```

## Layers
TODO - brief overview of two main models (TCP/IP and OSI) and the importance of layers architecture.
### Physical layer interfaces
1. BitSender - Transmitting raw bits over a communication channel.

### Data link layer interfaces
1. MAKEUPANAME - Break the packet from the network layer to `data frames` and transmit them using the physical layer.
2. MAKEUPANAME - Recieve packets from sender (at order, with error detection & flow control options).

Should maintain the order of packets sent from the sender's network layer to the reciever's network layer.


### Network layer
The network layer is the first layer that is end-to-end, and deals with routing packets all the way from the source of the packet to its intended destination.
1. PacketSender - Controls the routing of packets from source to destination. The packet is built first by the upper layers (Application and Transport) and then sent over the wire on the Link layer.

### Transport Layer
### Application Layer

TODO - brief overview of the entities for each layer (`new TwistedPair`, etc.)

## What's next?
`Computer Networks` book by Andrew S. Tanenbaum is a great source of knowledge, which I recommend strongly.
