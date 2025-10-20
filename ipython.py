from ipyparallel import Client
import sys

try:
    rc = Client()
except Exception as e:
    print(f"Failed to connect to the cluster: {e}", file=sys.stderr)
    sys.exit(1)

try:
    dview = rc[:]
except Exception as e:
    print(f"Failed to get view to the engines: {e}", file=sys.stderr)
    sys.exit(1)

def square(x):
    return x ** 2
