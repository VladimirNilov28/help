for ((i=1; i<=$1; i++)) 
do
    if [ $i -gt 100 ]; then
        break
    fi
    echo "$i times I've printed vladimirnilov"
done
