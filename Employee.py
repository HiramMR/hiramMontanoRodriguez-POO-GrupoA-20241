class Employee:
    def __init__(self, nombre):
        self.nombre = nombre
        self.accounts = []

    def agregar_cuenta(self, account):
        self.accounts.append(account)

    def get_nombre(self):
        return self.nombre

    def get_accounts(self):
        return self.accounts