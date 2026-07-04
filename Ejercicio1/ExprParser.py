# Generated from ./Expr.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,47,9,2,0,7,0,2,1,7,1,1,0,1,0,1,1,1,1,1,1,0,0,2,0,2,0,1,1,0,23,
        25,6,0,4,1,0,0,0,2,6,1,0,0,0,4,5,5,0,0,1,5,1,1,0,0,0,6,7,7,0,0,0,
        7,3,1,0,0,0,0
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'public'", "'static'", "'void'", "'class'", 
                     "'System'", "'out'", "'println'", "'break'", "'default'", 
                     "'this'", "'return'", "'for'", "'while'", "'do'", "'switch'", 
                     "'String'", "'int'", "'double'", "'char'", "'if'", 
                     "'else'", "'else if'", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", 
                     "'!'", "'>'", "'>='", "'<'", "'<='", "'='", "'('", 
                     "')'", "'['", "']'", "'{'", "'}'", "';'", "'.'" ]

    symbolicNames = [ "<INVALID>", "PUBLIC", "STATIC", "VOID", "CLASS", 
                      "SYSTEM", "OUT", "PRINTLN", "BREAK", "DEFAULT", "THIS", 
                      "RETURN", "FOR", "WHILE", "DO", "SWITCH", "STRING", 
                      "INT", "DOUBLE", "CHAR", "IF", "ELSE", "ELSE_IF", 
                      "TEXTO", "IDT", "NUM", "MAS", "MENOS", "POR", "ENTRE", 
                      "COMPLEMENTO", "AND", "OR", "NOT", "MAYOR", "MAYOR_IGUAL", 
                      "MENOR", "MENOR_IGUAL", "ASIGNACION", "PAR_1", "PAR_2", 
                      "COR_1", "COR_2", "LLA_1", "LLA_2", "PUNTO_COMA", 
                      "PUNTO", "WS" ]

    RULE_root = 0
    RULE_expr = 1

    ruleNames =  [ "root", "expr" ]

    EOF = Token.EOF
    PUBLIC=1
    STATIC=2
    VOID=3
    CLASS=4
    SYSTEM=5
    OUT=6
    PRINTLN=7
    BREAK=8
    DEFAULT=9
    THIS=10
    RETURN=11
    FOR=12
    WHILE=13
    DO=14
    SWITCH=15
    STRING=16
    INT=17
    DOUBLE=18
    CHAR=19
    IF=20
    ELSE=21
    ELSE_IF=22
    TEXTO=23
    IDT=24
    NUM=25
    MAS=26
    MENOS=27
    POR=28
    ENTRE=29
    COMPLEMENTO=30
    AND=31
    OR=32
    NOT=33
    MAYOR=34
    MAYOR_IGUAL=35
    MENOR=36
    MENOR_IGUAL=37
    ASIGNACION=38
    PAR_1=39
    PAR_2=40
    COR_1=41
    COR_2=42
    LLA_1=43
    LLA_2=44
    PUNTO_COMA=45
    PUNTO=46
    WS=47

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RootContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_root




    def root(self):

        localctx = ExprParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 4
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUM(self):
            return self.getToken(ExprParser.NUM, 0)

        def IDT(self):
            return self.getToken(ExprParser.IDT, 0)

        def TEXTO(self):
            return self.getToken(ExprParser.TEXTO, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_expr




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 6
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 58720256) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





