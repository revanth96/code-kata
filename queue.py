class Queue:
    def __init__(self):
        self.items = []
 
    def is_empty(self):
        return self.items == []
 
    def enqueue(self, data):
        self.items.append(data)
 
    def dequeue(self):
        return self.items.pop(0)
    def display(self):
        print (self.items)
 
 
q = Queue()
while True:
    print('1.enqueue ')
    print('2.dequeue')
    print('3.display')
    print('3.quit')
    operation = int (input('What would you like to do? '))
 
    
    if operation == 1:
        data=int (input("enter value"))
        q.enqueue(data)
    elif operation == 2:
        if q.is_empty():
            print('Queue is empty.')
        else:
            print('Dequeued value: ', q.dequeue())
    elif operation == 3:
        q.display()
    else:
        break
