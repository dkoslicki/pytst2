# Pytst2
This is basically a fork of [pytst](https://github.com/nlehuen/pytst) (a very fast ternary search tree implementation). However [pytst](https://github.com/nlehuen/pytst) is not on Pypi and the installation was a bit non-standard, so I made this repository simply to re-shuffle where the files are (putting ``setup.py`` in the top directory) and created a distribution using ``python setup.py sdist`` which is now in the ``dist`` folder. You can require this package in your own project by modifying your ``setup.py`` file to have the following lines inside of ``setup()``:
```python
install_requires=['pytst2'],
dependency_links=['https://github.com/dkoslicki/pytst2/blob/master/dist/pytst-1.18.tar.gz#egg=pytst2']

```
