
class User:
    __name=""
    __rented_a_book=False
    __books = []
    
    def __init__(self,name):
        self.__name = name
        self.__books = []
        
    def get_name(self):
        return self.__name
        
    def is_rented_a_book(self):
        return self.__rented_a_book
    
    def set_rented_a_book(self, rented_a_book):
        self.__rented_a_book = rented_a_book