# DVC-E1 – Versionsverwaltung mit Git

Name: vieth43  
Repository: https://github.com/vieth43/dvc-e1-git  
Pull Request zu edlich/education: https://github.com/edlich/education/pull/612

---

## 1. Repository erstellt

Ich habe für diese Aufgabe ein öffentliches GitHub-Repository erstellt:

https://github.com/vieth43/dvc-e1-git

Das Repository wurde lokal geklont und als lokale Sandbox verwendet.

Verwendete Befehle:

git clone https://github.com/vieth43/dvc-e1-git.git  
cd dvc-e1-git

---

## 2. Eigenes Projekt hochgeladen

Als eigenes Projekt habe ich ein Java-Programm verwendet: Eurorechner.

Die Datei befindet sich unter:

Eurorechner/Eurorechner.java

Das Programm ist ein einfacher Währungsrechner, der Euro in US-Dollar und US-Dollar in Euro umrechnen kann.

Verwendete Befehle:

git add Eurorechner/  
git commit -m "Eurorechner Java-Projekt hinzugefuegt"  
git push

---

## 3. git status

Mit git status habe ich geprüft, welche Dateien neu, geändert oder bereits gespeichert sind.

Verwendeter Befehl:

git status

Nach dem erfolgreichen Push zeigte Git:

nothing to commit, working tree clean

---

## 4. git add

Mit git add habe ich neue und geänderte Dateien in den Staging-Bereich aufgenommen.

Verwendeter Befehl:

git add Eurorechner/

Danach war die Datei Eurorechner/Eurorechner.java für den nächsten Commit vorgemerkt.

---

## 5. git commit

Mit git commit habe ich lokale Versionsstände gespeichert. Dabei wurde jeweils eine Commit-Nachricht angegeben.

Verwendeter Befehl:

git commit -m "Eurorechner Java-Projekt hinzugefuegt"

---

## 6. git push

Mit git push habe ich meine lokalen Commits zum entfernten GitHub-Repository hochgeladen.

Verwendeter Befehl:

git push

---

## 7. git diff

Ich habe im Java-Programm den Wechselkurs geändert und mir die Änderung vor dem Commit mit git diff anzeigen lassen.

Die Änderung war:

Eurorechner rechner = new Eurorechner(1.1);

zu:

Eurorechner rechner = new Eurorechner(1.08);

Verwendeter Befehl:

git diff

Danach wurde die Änderung gespeichert:

git add .  
git commit -m "Wechselkurs angepasst"  
git push

---

## 8. git pull

Ich habe eine Änderung direkt auf GitHub vorgenommen und diese anschließend mit git pull in meine lokale Sandbox übernommen.

Verwendeter Befehl:

git pull

Die Ausgabe zeigte unter anderem:

From https://github.com/vieth43/dvc-e1-git  
Fast-forward  
README.md | 3 ++-  
1 file changed, 2 insertions(+), 1 deletion(-)

---

## 9. git mv

Mit git mv habe ich eine Datei umbenannt. Die Java-Datei wurde testweise umbenannt und anschließend wieder korrekt zurückbenannt.

Verwendete Befehle:

git mv Eurorechner/Eurorechner.java Eurorechner/Waehrungsrechner.java  
git commit -m "Java-Datei umbenannt"  
git push

Danach wurde die Datei wieder korrekt benannt:

git mv Eurorechner/Waehrungsrechner.java Eurorechner/Eurorechner.java  
git commit -m "Java-Datei wieder korrekt benannt"  
git push

---

## 10. git rm

Mit git rm habe ich eine Datei aus dem Repository entfernt.

Zuerst wurde eine Testdatei erstellt:

echo Diese Datei wird mit git rm geloescht > remove-test.txt  
git add remove-test.txt  
git commit -m "Remove-Testdatei hinzugefuegt"  
git push

Danach wurde sie mit Git entfernt:

git rm remove-test.txt  
git status  
git commit -m "Remove-Testdatei geloescht"  
git push

---

## 11. Zeitreise mit Git

Mit git log --oneline habe ich mir die Commit-Historie anzeigen lassen.

Verwendeter Befehl:

git log --oneline

Danach bin ich zu einem älteren Commit gewechselt:

git checkout 4bc552d

Git zeigte dabei:

You are in 'detached HEAD' state.  
HEAD is now at 4bc552d Wechselkurs angepasst

Anschließend bin ich wieder zum aktuellen Hauptbranch zurückgekehrt:

git checkout main  
git status

---

## 12. Branch branch-a erstellt

Ich habe einen ersten Branch mit dem Namen branch-a erstellt und dort eine Änderung vorgenommen.

Verwendete Befehle:

git checkout -b branch-a  
echo Aenderung aus branch-a > branch-test.txt  
git add .  
git commit -m "Aenderung in branch-a"

---

## 13. Branch branch-b erstellt

Ich habe einen zweiten Branch mit dem Namen branch-b erstellt und dort eine ähnliche, aber andere Änderung vorgenommen.

Verwendete Befehle:

git checkout main  
git checkout -b branch-b  
echo Aenderung aus branch-b > branch-test.txt  
git add .  
git commit -m "Aenderung in branch-b"

---

## 14. Zwischen Branches gewechselt

Ich bin zwischen den Branches branch-a, branch-b und main gewechselt.

Verwendete Befehle:

git checkout branch-a  
git checkout branch-b  
git checkout main

Die Ausgabe zeigte:

Switched to branch 'branch-a'  
Switched to branch 'branch-b'  
Switched to branch 'main'

---

## 15. Branches gemerged

Ich habe beide Branches wieder in main integriert.

Zuerst wurde branch-a gemerged:

git merge branch-a

Danach wurde branch-b gemerged:

git merge branch-b

Dabei entstand ein Merge-Konflikt in branch-test.txt.

Die Datei enthielt zunächst:

<<<<<<< HEAD  
Aenderung aus branch-a  
=======  
Aenderung aus branch-b  
>>>>>>> branch-b

Ich habe den Konflikt manuell gelöst. Der endgültige Inhalt lautet:

Aenderung aus branch-a  
Aenderung aus branch-b

Danach wurde der gelöste Konflikt gespeichert:

git add branch-test.txt  
git commit -m "Merge-Konflikt zwischen branch-a und branch-b geloest"  
git push

---

## 16. Pull Request zu edlich/education

Ich habe über die GitHub-Weboberfläche einen Pull Request zum Repository edlich/education erstellt.

Der Pull Request wurde nicht über die Shell erstellt, sondern über GitHub im Browser.

Pull Request:

https://github.com/edlich/education/pull/612

Pull-Request-Nummer:

#612

Im Pull Request wurde eine kleine Datei ergänzt:

CLI-Folder/vieth43.txt

Inhalt:

Hallo aus der DVC-E1 Git-Aufgabe von vieth43.

---

## 17. Repository ist public

Das Repository ist öffentlich erreichbar:

https://github.com/vieth43/dvc-e1-git

---

## 18. Zusammenfassung der verwendeten Git-Befehle

In dieser Aufgabe wurden folgende Git-Befehle praktisch angewendet:

git clone  
git status  
git add  
git commit  
git push  
git pull  
git diff  
git mv  
git rm  
git log --oneline  
git checkout  
git merge

Zusätzlich wurde ein Pull Request über die GitHub-Weboberfläche erstellt.

---

## 19. Screenshots

Die Screenshots befinden sich im Ordner screenshots.

Sie dokumentieren:

- GitHub-Repository public
- git status
- git add
- git commit
- git push
- git diff
- git pull
- git mv
- git rm
- git log --oneline
- Zeitreise mit git checkout
- Branch branch-a
- Branch branch-b
- Wechsel zwischen Branches
- Merge von branch-a
- Merge-Konflikt mit branch-b
- gelöster Merge-Konflikt
- Pull Request #612
