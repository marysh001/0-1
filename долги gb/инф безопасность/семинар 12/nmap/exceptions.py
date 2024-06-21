#  nmap3.py

import shlex
import subprocess
import sys
import re

__author__ = 'Wangolo Joel (inquiry@nmapper.com)'
__version__ = '1.5.2'
__last_modification__ = 'May/24/2022'

class NmapNotInstalledError(Exception):
    """Exception raised when nmap is not installed"""
    
    def __init__(self, message="Nmap is either not installed or we couldn't locate nmap path Please ensure nmap is installed"):
        self.message = message 
        super().__init__(message)
        
class NmapXMLParserError(Exception):
    """Exception raised when we can't parse the output"""
    
    def __init__(self, message="Unable to parse xml output"):
        self.message = message 
        super().__init__(message)

class NmapExecutionError(Exception):
    """Exception raised when en error occurred during nmap call"""

