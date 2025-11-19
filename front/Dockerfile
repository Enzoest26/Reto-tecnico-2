FROM nginx:alpine


COPY nginx.conf /etc/nginx/nginx.conf
COPY index.html /usr/share/nginx/html/index.html
COPY app.js /usr/share/nginx/html/app.js

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]