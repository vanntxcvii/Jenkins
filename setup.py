from setuptools import setup

setup(
    name='myapp',
    version='0.1.0',
    install_requires=[
        'flask==2.0.0',
    ],
    packages=['myapp'],
    entry_points={
        'console_scripts': [
            'myapp=myapp.app:main'
        ]
    }
)
