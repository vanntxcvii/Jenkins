import requests

url = 'https://myapp.com'
response = requests.get(url)
print(response.text)
