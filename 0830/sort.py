from operator import itemgetter
n = int(input())
lista = [input().split(',') for i in range(1,n+1)]

l = []

hokaidou = []
aomori = []
iwate = []
miyagi = []
akita = []
yamagata = []
hukushima = []
ibaragi =[]
totigi = []
gunma =[]
saitama = []
tiba = []
toukyou = []
kanagawa = []
niigata = []
toyama = []
isikawa = []
fukui = []
yamanasi = []
nagano = []
gihu = []
sizuoka = []
aiti = []
mie = []
siga = []
kyouto = []
oosaka = []
hyougo = []
nara = []
wakayama = []
totori = []
simane = []
okayama = []
hirosima = []
yamaguti = []
tokusima = []
kagawa = []
ehime = []
kouti = []
hukuoka = []
sagawa = []
nagasaki = []
kumamoto = []
ooita = []
miyazaki = []
kagosima = []
okinawa = []

for i in lista:
    if ('北海道' in i):
        hokaidou.append(i)
    if ('青森県' in i):
        aomori.append(i)
    if ('岩手県' in i):
        iwate.append(i)
    if ('宮城県' in i):
        miyagi.append(i)
    if ('秋田県' in i):
        akita.append(i)
    if ('山形県' in i):
        yamagata.append(i)
    if ('福島県' in i):
        hukushima.append(i)
    if ('茨城県' in i):
        ibaragi.append(i)
    if ('栃木県' in i):
        totigi.append(i)
    if ('群馬県' in i):
        gunma.append(i)
    if ('埼玉県' in i):
        saitama.append(i)
    if ('千葉県' in i):
        tiba.append(i)
    if ('東京都' in i):
        toukyou.append(i)
    if ('神奈川県' in i):
        kanagawa.append(i)
    if ('新潟県' in i):
        niigata.append(i)
    if ('富山県' in i):
        toyama.append(i)
    if ('石川県' in i):
        isikawa.append(i)
    if ('福井県' in i):
        fukui.append(i)
    if ('山梨県' in i):
        yamanasi.append(i)
    if ('長野県' in i):
        nagano.append(i)
    if ('岐阜県' in i):
        gihu.append(i)
    if ('静岡県' in i):
        sizuoka.append(i)
    if ('愛知県' in i):
        aiti.append(i)
    if ('三重県' in i):
        mie.append(i)
    if ('滋賀県' in i):
        siga.append(i)
    if ('京都府' in i):
        kyouto.append(i)
    if ('大阪府' in i):
        oosaka.append(i)
    if ('兵庫県' in i):
        hyougo.append(i)
    if ('奈良県' in i):
        nara.append(i)
    if ('和歌山県' in i):
        wakayama.append(i)
    if ('鳥取県' in i):
        totori.append(i)
    if ('島根県' in i):
        simane.append(i)
    if ('岡山県' in i):
        okayama.append(i)
    if ('広島県' in i):
        hirosima.append(i)
    if ('山口県' in i):
        yamaguti.append(i)
    if ('徳島県' in i):
        tokusima.append(i)
    if ('香川県' in i):
        kagawa.append(i)
    if ('愛媛県' in i):
        ehime.append(i)
    if ('高知県' in i):
        kouti.append(i)
    if ('福岡県' in i):
        hukuoka.append(i)
    if ('佐賀県' in i):
        sagawa.append(i)
    if ('長崎県' in i):
        nagasaki.append(i)
    if ('熊本県' in i):
        kumamoto.append(i)
    if ('大分県' in i):
        ooita.append(i)
    if ('宮崎県' in i):
        miyazaki.append(i)
    if ('鹿児島県' in i):
        kagosima.append(i)
    else:
        okinawa.append(i)
#lista.sort(key=itemgetter(12))
def retu (x):
    name = ''
    men = 0
    man = 0
    goukei = len(x)
    for i in x:
        if ('男' in i):
            men += 1
            name = i[6]
    man = goukei - men
    return l.append([name,goukei,men,man])
retu(hokaidou)
retu(aomori)
retu(iwate)
retu(miyagi)
retu(akita)
retu(yamagata)
retu(hukushima)
retu(ibaragi)
retu(totigi)
retu(gunma)
retu(saitama)
retu(tiba)
retu(toukyou)
retu(kanagawa)
retu(niigata)
retu(toyama)
retu(isikawa)
retu(fukui)
retu(yamanasi)
retu(nagano)
retu(gihu)
retu(sizuoka)
retu(aiti)
retu(mie)
retu(siga)
retu(kyouto)
retu(oosaka)
retu(hyougo)
retu(nara)
retu(wakayama)
retu(totori)
retu(simane)
retu(okayama)
retu(hirosima)
retu(yamaguti)
retu(tokusima)
retu(kagawa)
retu(ehime)
retu(kouti)
retu(hukuoka)
retu(sagawa)
retu(nagasaki)
retu(kumamoto)
retu(ooita)
retu(miyazaki)
retu(kagosima)
sort = []
sort = sorted(l,key=lambda x:(x[1],x[2],x[3]),reverse=True)
for i in sort:
    print(i)
