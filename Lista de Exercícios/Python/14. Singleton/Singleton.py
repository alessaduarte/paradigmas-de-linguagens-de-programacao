class Configuracao:
    _instancia = None
    def __init__(cls):
        if cls._instancia is None:
            cls._instancia = super(Configuracao, cls).__new__(cls)
            cls._instancia.configuracoes = {}
        return cls._instancia