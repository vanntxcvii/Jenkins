import os

if os.getenv('APP_ENV') == 'production':
  print('Running in production environment')
else:
  print('Running in development environment')
