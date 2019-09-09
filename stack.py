
class Stack:
    stack = []  # empty list
    max_size = -1

    def __init__(self, size=-1):  # defining maximum size in the constructor
        self.max_size = size

    def push(self, item):
        if self.max_size == -1:  # if there is no limit in stack
            self.stack.append(item)
        elif len(self.stack) < self.max_size:  # if max limit not crossed
            self.stack.append(item)
        else:  # if max limit crossed
            print('Can\'t add item. Stack limit is :', self.max_size)
            raise RuntimeError

    def pop(self):
        if len(self.stack) > 0:
            temp = self.stack[-1]
            self.stack.pop()
            return temp
        else:
            print('stack is already empty.')

    def top(self):
        if len(self.stack) > 0:
            return self.stack[-1]  # returns the last item
        else:
            print('stack is already empty.')
            raise IndexError
        
    def display(self):
        for i in self.stack:
            print (i,end=" ")

obj = Stack()
while (1):
    data =int (input ("1.push 2.pop 3.exit"))
    
    if (data == 1) :
        print ("enter the element")
        value=int(input())
        obj.push(value)
        obj.display()
        
    elif (data == 2):
        print('Pop the last item :', obj.pop())
        obj.display()
    else:
        break
    
