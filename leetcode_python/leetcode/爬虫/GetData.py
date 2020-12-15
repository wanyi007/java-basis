import requests

if __name__ == '__main__':
    target = 'https://api.fachans.com/sys_config/project/scope'
    headers = {'authorization':'Bearer 6Yd1nndMogkjeRiS5O8pPOf4LU58Wm'}
    get = requests.get(url=target,verify=False,headers=headers)
    print (get.text)