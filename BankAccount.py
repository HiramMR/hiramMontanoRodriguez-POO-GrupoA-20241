class BankAccount:
    def __init__(self, numero_cuenta, saldo_cuenta, tipo_cuenta):
        self.numero_cuenta = numero_cuenta
        self.saldo_cuenta = saldo_cuenta
        self.tipo_cuenta = tipo_cuenta

    def get_numero_cuenta(self):
        return self.numero_cuenta

    def get_saldo_cuenta(self):
        return self.saldo_cuenta

    def set_saldo_cuenta(self, saldo_cuenta):
        self.saldo_cuenta = saldo_cuenta

    def get_tipo_cuenta(self):
        return self.tipo_cuenta

    def depositA(self, tipo_cuenta, saldo_cuenta):
        if tipo_cuenta.upper() == "A":
            if saldo_cuenta > 50000:
                print("No se puede depositar más de 50,000 en una cuenta de tipo A")
                self.set_saldo_cuenta(0)
            else:
                self.set_saldo_cuenta(saldo_cuenta)

    def depositB(self, tipo_cuenta, saldo_cuenta):
        if tipo_cuenta.upper() == "B":
            if saldo_cuenta > 100000:
                print("No se puede depositar más de 100,000 en una cuenta de tipo B")
                self.set_saldo_cuenta(0)
            else:
                self.set_saldo_cuenta(saldo_cuenta)

    def depositC(self, tipo_cuenta, saldo_cuenta):
        if tipo_cuenta.upper() == "C":
            self.set_saldo_cuenta(saldo_cuenta)