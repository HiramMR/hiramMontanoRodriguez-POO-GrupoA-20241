import random
class Book:
    __title=""
    __isRented = False
    __id=0
    
    def __init__(self,title):
        self.__title = title
        
    def get_title(self):
        return self.__title
    
    def set_title(self, title):
        self.__title = title
        
    def is_rented(self):
        return self.__isRented
    
    def set_rented(self, isRented):
        self.__isRented = isRented
        